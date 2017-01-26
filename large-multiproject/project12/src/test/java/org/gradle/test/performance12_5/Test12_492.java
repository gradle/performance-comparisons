package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_492 {
    private final Production12_492 production = new Production12_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}