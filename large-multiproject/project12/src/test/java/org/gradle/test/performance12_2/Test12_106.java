package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_106 {
    private final Production12_106 production = new Production12_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}