package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_87 {
    private final Production12_87 production = new Production12_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}