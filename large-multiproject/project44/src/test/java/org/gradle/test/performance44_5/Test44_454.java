package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_454 {
    private final Production44_454 production = new Production44_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}