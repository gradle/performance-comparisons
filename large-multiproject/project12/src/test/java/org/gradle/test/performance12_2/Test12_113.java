package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_113 {
    private final Production12_113 production = new Production12_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}