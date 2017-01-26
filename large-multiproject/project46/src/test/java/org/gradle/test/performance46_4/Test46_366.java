package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_366 {
    private final Production46_366 production = new Production46_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}