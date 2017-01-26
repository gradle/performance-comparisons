package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_50 {
    private final Production46_50 production = new Production46_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}