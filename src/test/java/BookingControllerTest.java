import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class BookingControllerTest {

    String URL = "http://slavacheck.somee.com/api/Booking";
    @Test
    public void BookingWithCorrectInf(){
        int itemid = 16;
        int count = 1;
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", someRandomString);
        requestBody.put("email", someRandomString);
        requestBody.put("odredNumber", someRandomString);
        requestBody.put("count", count);
        requestBody.put("itemId", itemid);

        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString());
        Response response = request.post(URL);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test
    public void BookingWithIncorrectCount(){
        int itemid = 16;
        int count = -1;
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", someRandomString);
        requestBody.put("email", someRandomString);
        requestBody.put("odredNumber", someRandomString);
        requestBody.put("count", count);
        requestBody.put("itemId", itemid);

        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString());
        Response response = request.post(URL);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(500, statusCode  );
    }

    @Test
    public void BookingWithIncorrectId(){
        int itemid = -1;
        int count = 1;
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", someRandomString);
        requestBody.put("email", someRandomString);
        requestBody.put("odredNumber", someRandomString);
        requestBody.put("count", count);
        requestBody.put("itemId", itemid);

        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString());
        Response response = request.post(URL);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(  500, statusCode);
    }

    @Test
    public void Returns400(){
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());
        String url = "/SendEmail";
        int itemIdNullAvailiable = 3;

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", someRandomString);
        requestBody.put("email", someRandomString);
        requestBody.put("odredNumber", someRandomString);
        requestBody.put("count", Integer.MAX_VALUE);
        requestBody.put("itemId", itemIdNullAvailiable);

        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString());
        Response response = request.post(URL + url);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(  400, statusCode);

    }


    @Test
    public void Returns200(){
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());
        String url = "http://slavacheck.somee.com/api/SendEmail";
        int itemIdAvailiable = 5;

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", someRandomString);
        requestBody.put("email", someRandomString);
        requestBody.put("odredNumber", someRandomString);
        requestBody.put("count", 1);
        requestBody.put("itemId", itemIdAvailiable);

        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString());
        Response response = request.post(url);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(  200, statusCode);

    }}