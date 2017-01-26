package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_298 {
    private final Production12_298 production = new Production12_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}