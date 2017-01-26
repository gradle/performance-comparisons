package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_454 {
    private final Production69_454 production = new Production69_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}