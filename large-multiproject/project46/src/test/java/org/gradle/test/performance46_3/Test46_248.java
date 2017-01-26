package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_248 {
    private final Production46_248 production = new Production46_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}