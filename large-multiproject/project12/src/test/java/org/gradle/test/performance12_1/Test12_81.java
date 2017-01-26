package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_81 {
    private final Production12_81 production = new Production12_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}