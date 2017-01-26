package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_453 {
    private final Production12_453 production = new Production12_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}