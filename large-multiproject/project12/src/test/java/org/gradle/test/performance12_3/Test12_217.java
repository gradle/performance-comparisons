package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_217 {
    private final Production12_217 production = new Production12_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}