package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_178 {
    private final Production13_178 production = new Production13_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}