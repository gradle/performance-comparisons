package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_245 {
    private final Production46_245 production = new Production46_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}