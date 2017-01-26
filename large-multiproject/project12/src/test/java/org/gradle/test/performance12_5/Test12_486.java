package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_486 {
    private final Production12_486 production = new Production12_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}