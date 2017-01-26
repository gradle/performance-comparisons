package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_454 {
    private final Production49_454 production = new Production49_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}