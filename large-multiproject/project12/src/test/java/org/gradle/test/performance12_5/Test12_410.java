package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_410 {
    private final Production12_410 production = new Production12_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}