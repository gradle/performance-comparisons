package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_108 {
    private final Production12_108 production = new Production12_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}