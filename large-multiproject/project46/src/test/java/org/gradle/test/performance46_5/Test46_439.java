package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_439 {
    private final Production46_439 production = new Production46_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}