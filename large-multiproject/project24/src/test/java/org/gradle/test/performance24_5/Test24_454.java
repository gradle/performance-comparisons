package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_454 {
    private final Production24_454 production = new Production24_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}