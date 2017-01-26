package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_153 {
    private final Production46_153 production = new Production46_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}