package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_233 {
    private final Production12_233 production = new Production12_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}