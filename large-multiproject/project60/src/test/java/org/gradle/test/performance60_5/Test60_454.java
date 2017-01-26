package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_454 {
    private final Production60_454 production = new Production60_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}