package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_115 {
    private final Production12_115 production = new Production12_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}