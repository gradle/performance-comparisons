package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_454 {
    private final Production46_454 production = new Production46_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}