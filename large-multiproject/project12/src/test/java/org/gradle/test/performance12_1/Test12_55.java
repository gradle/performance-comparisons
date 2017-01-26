package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_55 {
    private final Production12_55 production = new Production12_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}