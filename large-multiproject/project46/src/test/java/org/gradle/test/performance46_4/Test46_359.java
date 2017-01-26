package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_359 {
    private final Production46_359 production = new Production46_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}