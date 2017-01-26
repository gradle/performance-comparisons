package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_324 {
    private final Production12_324 production = new Production12_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}