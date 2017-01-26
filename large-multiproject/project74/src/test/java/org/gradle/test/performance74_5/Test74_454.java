package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_454 {
    private final Production74_454 production = new Production74_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}