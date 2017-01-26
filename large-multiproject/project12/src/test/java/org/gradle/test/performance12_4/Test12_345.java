package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_345 {
    private final Production12_345 production = new Production12_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}