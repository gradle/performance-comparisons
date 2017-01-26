package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_453 {
    private final Production23_453 production = new Production23_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}