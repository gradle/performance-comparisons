package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_30 {
    private final Production12_30 production = new Production12_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}