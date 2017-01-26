package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_344 {
    private final Production46_344 production = new Production46_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}