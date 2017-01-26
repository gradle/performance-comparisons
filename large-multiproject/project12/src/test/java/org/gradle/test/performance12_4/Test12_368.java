package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_368 {
    private final Production12_368 production = new Production12_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}