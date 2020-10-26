package home.train;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before -- from Before ALL");
    }

    @BeforeEach
    void setUp() {
        System.out.println("before each class");
        greeting= new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Hossein"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each class");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After-- from after all");
    }
}