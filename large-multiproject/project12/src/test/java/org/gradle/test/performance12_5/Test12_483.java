package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_483 {
    private final Production12_483 production = new Production12_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}