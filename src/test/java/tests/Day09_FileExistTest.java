package tests;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExistTest {
    @Test
    public void isExistTest(){
//        Pick a file on your desktop
//        1 cup of water
//        And verify if that file exist on your computer or not
        String userDIR= System.getProperty("user.dir");       //=>gives the path of the current folder
        System.out.println(userDIR);
        String userHOME=System.getProperty("user.home");      //=>gives you the user folder
        System.out.println(userHOME);


//        Pick a file on your desktop
//        And verify if that file exist on your computer or not
        String pathOfFile = userHOME + "/Desktop/logo.jpeg";//WRITING THE PATH DYNAMICALLY SO TIS PATH CAN WORKS ON OTHER LAPTOPS
        boolean isExist = Files.exists(Paths.get(pathOfFile));//returns TRUE if file exists. FALSE if file doesn't exists
        Assert.assertTrue(isExist);







    }
}
