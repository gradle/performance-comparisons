package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_473 {
    private final Production12_473 production = new Production12_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}