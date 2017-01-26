package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_479 {
    private final Production12_479 production = new Production12_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}