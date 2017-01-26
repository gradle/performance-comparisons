package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_433 {
    private final Production46_433 production = new Production46_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}