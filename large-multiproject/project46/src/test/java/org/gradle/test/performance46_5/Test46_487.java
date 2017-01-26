package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_487 {
    private final Production46_487 production = new Production46_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}