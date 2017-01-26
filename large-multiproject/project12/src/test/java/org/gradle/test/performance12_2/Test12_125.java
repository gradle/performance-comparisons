package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_125 {
    private final Production12_125 production = new Production12_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}