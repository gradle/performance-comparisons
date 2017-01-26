package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_180 {
    private final Production12_180 production = new Production12_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}