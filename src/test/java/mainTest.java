
import com.ua.ChessTurn.Convertor;
import com.ua.ChessTurn.Chess;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.ua.ChessTurn.Chess.checkForCorrect;
import static com.ua.ChessTurn.Convertor.getIndex;
import static com.ua.ChessTurn.Knight.checkCondition;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class mainTest {
    @Mock
    Convertor convertMock;
    @InjectMocks
    Chess unit = new Chess(convertMock);


    @Test
    public void checkCorrect(){
        boolean result = unit.checkForCorrect(new String[]{"s", "18"});
        Assert.assertFalse(result);
    }

    @Test
    public void Condition(){
        boolean result = checkCondition(new int[] {0,1}, new int[] {1,0});
        Assert.assertFalse(result);
    }

    @Test
    public void cordToIndex(){
       /* Mockito.when(convertMock.getIndex(any())).thenReturn(new int[] {0,0});*/ //Я хз вообще. Крутил,вертел, но с этой строкой null puint
        int[] result = convertMock.getIndex(new String[] {"a","1"});
        Assert.assertArrayEquals(new int[] {0,0},result);
    }
}