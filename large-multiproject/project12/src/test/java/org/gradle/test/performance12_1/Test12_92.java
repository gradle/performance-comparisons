package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_92 {
    private final Production12_92 production = new Production12_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}