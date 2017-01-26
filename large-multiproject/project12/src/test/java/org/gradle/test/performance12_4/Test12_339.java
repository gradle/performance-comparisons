package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_339 {
    private final Production12_339 production = new Production12_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}