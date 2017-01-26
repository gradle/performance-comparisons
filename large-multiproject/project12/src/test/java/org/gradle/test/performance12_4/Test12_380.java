package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_380 {
    private final Production12_380 production = new Production12_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}