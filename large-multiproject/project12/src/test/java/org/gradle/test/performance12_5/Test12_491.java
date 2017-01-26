package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_491 {
    private final Production12_491 production = new Production12_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}