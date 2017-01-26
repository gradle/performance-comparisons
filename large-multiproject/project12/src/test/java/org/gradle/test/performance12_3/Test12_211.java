package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_211 {
    private final Production12_211 production = new Production12_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}