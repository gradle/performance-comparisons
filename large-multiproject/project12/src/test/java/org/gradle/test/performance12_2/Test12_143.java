package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_143 {
    private final Production12_143 production = new Production12_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}