package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_441 {
    private final Production12_441 production = new Production12_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}