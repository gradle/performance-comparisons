package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_174 {
    private final Production12_174 production = new Production12_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}