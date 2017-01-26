package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_117 {
    private final Production46_117 production = new Production46_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}