package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_397 {
    private final Production46_397 production = new Production46_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}