package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_462 {
    private final Production12_462 production = new Production12_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}