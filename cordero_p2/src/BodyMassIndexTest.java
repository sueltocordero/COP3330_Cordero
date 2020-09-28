import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BodyMassIndexTest {

    @Test
    void underweightBMI(){
        BodyMassIndex test = new BodyMassIndex(70,101.2);
        //703*(101.2)/(60^2)=14.51 ~~ 14.5
        assertEquals(14.5, test.returnBMI());
    }
    @Test
    void normalBMI(){
        BodyMassIndex test = new BodyMassIndex(80,205.6);
        //703*(205.6)/(80^2)=22.58~~22.6
        assertEquals(22.6, test.returnBMI());
    }
    @Test
    void overweightBMI(){
        BodyMassIndex test = new BodyMassIndex(71.5,200);
        //703*(200)/(71.5^2)=27.50~~27.5
        assertEquals(27.5, test.returnBMI());
    }
    @Test
    void obeseBMI(){
        BodyMassIndex test = new BodyMassIndex(74,300);
        //703*(300)/(74^2)=38.51 ~~ 38.5
        assertEquals(38.5, test.returnBMI());
    }



    @Test
    void underweightCategory(){
        BodyMassIndex test = new BodyMassIndex(70,101.2);
        assertSame("Underweight",test.returnCategory());
    }

    @Test
    void normalCategory(){
        BodyMassIndex test = new BodyMassIndex(80,205.6);
        assertSame("Normal",test.returnCategory());
    }

    @Test
    void overweightCategory(){
        BodyMassIndex test = new BodyMassIndex(71.5,200);
        assertSame("Overweight",test.returnCategory());
    }

    @Test
    void obeseCategory(){
        BodyMassIndex test = new BodyMassIndex(74,300);
        assertSame("Obese",test.returnCategory());
    }
}
