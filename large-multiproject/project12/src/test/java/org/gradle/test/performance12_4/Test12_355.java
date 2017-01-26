package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_355 {
    private final Production12_355 production = new Production12_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}