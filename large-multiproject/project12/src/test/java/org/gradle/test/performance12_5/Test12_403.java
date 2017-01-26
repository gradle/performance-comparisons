package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_403 {
    private final Production12_403 production = new Production12_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}