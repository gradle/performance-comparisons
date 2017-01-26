package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_400 {
    private final Production12_400 production = new Production12_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}