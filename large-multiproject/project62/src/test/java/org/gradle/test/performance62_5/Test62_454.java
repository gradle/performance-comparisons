package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_454 {
    private final Production62_454 production = new Production62_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}