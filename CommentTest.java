

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testingAuthorAndRatingDetails()
    {
        SalesItem salesIte1 = new SalesItem("Cheese", 1000000);
        assertEquals(true, salesIte1.addComment("IHateCheese", "Why do they make these, it's awful!", 1));
        salesIte1.showInfo();
    }

    @Test
    public void testingUpVote()
    {
        SalesItem salesIte1 = new SalesItem("Cheese", 1000000);
        assertEquals(true, salesIte1.addComment("Dave", "The best cheese ever, worth the price, sue me!", 5));
        salesIte1.downvoteComment(0);
        salesIte1.showInfo();
        salesIte1.upvoteComment(0);
        salesIte1.showInfo();
        salesIte1.upvoteComment(0);
        salesIte1.showInfo();
    }
}


