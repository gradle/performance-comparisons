package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_95 {
    private final Production12_95 production = new Production12_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}