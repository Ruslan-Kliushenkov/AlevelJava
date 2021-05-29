
import com.ua.ChessTurn.Convertor;
import com.ua.ChessTurn.Chess;
import com.ua.ChessTurn.Knight;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;


public class mainTest {
    @Mock
    Convertor convertMock = Mockito.spy(Convertor.class);
    Knight knight = new Knight();
    @InjectMocks
    Chess unit = new Chess(convertMock);


    @Test
    public void checkCorrect(){
        boolean result = unit.checkForCorrect(new String[]{"s", "18"});
        Assert.assertFalse(result);
    }

    @Test
    public void Condition(){
        boolean result = knight.checkCondition(new int[] {0,1}, new int[] {1,0});
        Assert.assertFalse(result);
    }

    @Test
    public void cordToIndex(){
       /* Mockito.when(convertMock.getIndex(any())).thenReturn(new int[] {0,0});*/ //Я хз вообще. Крутил,вертел, но с этой строкой null puint
        int[] result = convertMock.getIndex(new String[] {"a","1"});
        Assert.assertArrayEquals(new int[] {0,0},result);
    }
}