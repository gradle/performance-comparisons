package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_103 {
    private final Production12_103 production = new Production12_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}