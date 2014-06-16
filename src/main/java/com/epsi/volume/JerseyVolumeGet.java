package com.epsi.volume;

import com.epsi.BookData;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.map.ObjectMapper;

import java.net.URLEncoder;
import java.util.Scanner;

/**
 * Created by maxencegodeneche on 07/06/2014.
 */
public class JerseyVolumeGet {
    public static void main(String[] args) {
        try {

            Client client = Client.create();

            Scanner sc = new Scanner(System.in);
            System.out.println("Donnez le titre d'un livre..");
            String titre = sc.nextLine();

            WebResource webResource = client
                    .resource("https://www.googleapis.com/books/v1/volumes?q="+ URLEncoder.encode(titre));

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Noob you Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            ObjectMapper mapper = new ObjectMapper();
            BookData bookData = mapper.readValue(output, BookData.class);


            for(int i=0;i<bookData.getItems().size();i++) {
                System.out.println(bookData.getItems().get(i).getVolumeInfo().getTitle() + bookData.getItems().get(i).getVolumeInfo().getISBNINFOS());

            }



        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}