package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_399 {
    private final Production12_399 production = new Production12_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}