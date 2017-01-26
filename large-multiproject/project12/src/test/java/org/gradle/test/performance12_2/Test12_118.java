package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_118 {
    private final Production12_118 production = new Production12_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}