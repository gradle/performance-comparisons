package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_454 {
    private final Production61_454 production = new Production61_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}