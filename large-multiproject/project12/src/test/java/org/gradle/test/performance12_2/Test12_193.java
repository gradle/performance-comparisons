package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_193 {
    private final Production12_193 production = new Production12_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}