package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_454 {
    private final Production39_454 production = new Production39_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}