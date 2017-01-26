package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_279 {
    private final Production46_279 production = new Production46_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}