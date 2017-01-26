package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_213 {
    private final Production12_213 production = new Production12_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}