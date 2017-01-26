package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_277 {
    private final Production46_277 production = new Production46_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}