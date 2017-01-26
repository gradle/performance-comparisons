package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_454 {
    private final Production72_454 production = new Production72_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}