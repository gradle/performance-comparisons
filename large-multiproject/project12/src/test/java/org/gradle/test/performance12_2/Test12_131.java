package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_131 {
    private final Production12_131 production = new Production12_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}