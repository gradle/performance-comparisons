package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_453 {
    private final Production61_453 production = new Production61_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}