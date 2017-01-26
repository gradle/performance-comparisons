package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_438 {
    private final Production12_438 production = new Production12_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}