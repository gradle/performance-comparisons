package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_292 {
    private final Production46_292 production = new Production46_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}