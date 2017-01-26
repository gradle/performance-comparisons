package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_139 {
    private final Production12_139 production = new Production12_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}