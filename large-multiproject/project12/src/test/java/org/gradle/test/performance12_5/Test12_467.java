package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_467 {
    private final Production12_467 production = new Production12_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}