package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_130 {
    private final Production47_130 production = new Production47_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}