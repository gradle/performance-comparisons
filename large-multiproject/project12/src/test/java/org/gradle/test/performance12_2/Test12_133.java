package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_133 {
    private final Production12_133 production = new Production12_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}