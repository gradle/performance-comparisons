package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_190 {
    private final Production12_190 production = new Production12_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}