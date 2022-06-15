import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ItemsControllerTest {

    public List<String> GetItems(){
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://slavacheck.somee.com/api/Items")
                .then().log()
                .body()
                .extract().response().jsonPath().get("name");
    }

    public  List<Item> SearchItems(String searchTag ){ // метода больше нет
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://slavacheck.somee.com/api/Find/" + searchTag)
                .then().log().body()
                .extract().response().jsonPath().get();
    }


    @Test // метода больше нет
    public void CorrectSearchItems() {
        List<String> names = GetItems();
        String searchTag = names.get(1);
        Assert.assertTrue(SearchItems(searchTag)
                .stream().allMatch(x -> x.getName().toLowerCase().contains(searchTag.toLowerCase())));
    }
    @Test // метода больше нет
    public void EmptySearchItems() {
        String searchTag = "";
        Assert.assertTrue(SearchItems(searchTag).isEmpty());
    }
}