package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_276 {
    private final Production12_276 production = new Production12_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}