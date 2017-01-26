package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_161 {
    private final Production12_161 production = new Production12_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}