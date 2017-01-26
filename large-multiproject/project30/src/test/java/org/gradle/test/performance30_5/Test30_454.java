package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_454 {
    private final Production30_454 production = new Production30_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}