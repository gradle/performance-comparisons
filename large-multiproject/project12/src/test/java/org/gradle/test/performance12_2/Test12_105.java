package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_105 {
    private final Production12_105 production = new Production12_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}