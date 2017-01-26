package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_385 {
    private final Production12_385 production = new Production12_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}