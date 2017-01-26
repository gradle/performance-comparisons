package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_114 {
    private final Production12_114 production = new Production12_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}