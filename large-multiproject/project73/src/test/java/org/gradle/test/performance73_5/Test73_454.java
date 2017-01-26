package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_454 {
    private final Production73_454 production = new Production73_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}