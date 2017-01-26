package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_65 {
    private final Production12_65 production = new Production12_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}