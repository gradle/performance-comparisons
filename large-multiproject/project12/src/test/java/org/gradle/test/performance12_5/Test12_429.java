package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_429 {
    private final Production12_429 production = new Production12_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}