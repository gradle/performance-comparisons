package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_16 {
    private final Production12_16 production = new Production12_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}