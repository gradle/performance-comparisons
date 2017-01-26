package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_481 {
    private final Production23_481 production = new Production23_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}