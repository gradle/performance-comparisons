package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_446 {
    private final Production12_446 production = new Production12_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}