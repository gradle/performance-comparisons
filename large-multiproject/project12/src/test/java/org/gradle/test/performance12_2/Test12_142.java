package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_142 {
    private final Production12_142 production = new Production12_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}