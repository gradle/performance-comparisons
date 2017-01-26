package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_130 {
    private final Production46_130 production = new Production46_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}