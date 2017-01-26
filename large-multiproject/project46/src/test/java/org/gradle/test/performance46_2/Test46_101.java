package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_101 {
    private final Production46_101 production = new Production46_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}