import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import plurasight.StringCircularBuffer;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    private StringCircularBuffer buffer = new StringCircularBuffer(2);

    @Test
    public  void shouldOfferPollableElement(){
        Assertions.assertTrue(buffer.offer(1));

        Assertions.assertEquals(1, buffer.poll());
        Assertions.assertNull(buffer.poll());
    }

    @Test
    public void shouldNotOfferWhenBufferIsFull(){
        Assertions.assertTrue(buffer.offer(1));
        Assertions.assertTrue(buffer.offer(2));
        Assertions.assertFalse(buffer.offer(3));
    }

    @Test
    public void shouldNotPollWhenBufferIsEmpty(){
        Assertions.assertNull(buffer.poll());
    }

    @Test
    public void shouldRecycleBuffer(){
        Assertions.assertTrue(buffer.offer(1));
        Assertions.assertTrue(buffer.offer(2));
        Assertions.assertEquals(1,buffer.poll());
        Assertions.assertTrue(buffer.offer(3));
        Assertions.assertEquals(2,buffer.poll());
        Assertions.assertEquals(3,buffer.poll());
    }

}
