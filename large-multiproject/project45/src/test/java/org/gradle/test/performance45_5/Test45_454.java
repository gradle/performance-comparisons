package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_454 {
    private final Production45_454 production = new Production45_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}