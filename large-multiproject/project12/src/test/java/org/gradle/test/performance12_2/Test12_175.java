package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_175 {
    private final Production12_175 production = new Production12_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}