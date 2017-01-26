package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_430 {
    private final Production46_430 production = new Production46_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}