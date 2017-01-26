package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_301 {
    private final Production12_301 production = new Production12_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}