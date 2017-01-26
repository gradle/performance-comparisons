package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_250 {
    private final Production12_250 production = new Production12_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}