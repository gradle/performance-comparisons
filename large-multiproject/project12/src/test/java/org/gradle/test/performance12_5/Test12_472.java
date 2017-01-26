package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_472 {
    private final Production12_472 production = new Production12_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}