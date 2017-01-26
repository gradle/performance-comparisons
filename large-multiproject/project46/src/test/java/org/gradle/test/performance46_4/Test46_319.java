package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_319 {
    private final Production46_319 production = new Production46_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}