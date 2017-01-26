package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_499 {
    private final Production12_499 production = new Production12_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}