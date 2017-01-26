package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_454 {
    private final Production15_454 production = new Production15_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}