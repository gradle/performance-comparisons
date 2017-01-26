package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_122 {
    private final Production12_122 production = new Production12_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}