package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_436 {
    private final Production12_436 production = new Production12_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}