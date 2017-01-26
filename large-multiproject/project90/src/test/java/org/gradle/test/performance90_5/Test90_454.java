package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_454 {
    private final Production90_454 production = new Production90_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}