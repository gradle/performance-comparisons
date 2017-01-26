package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_12 {
    private final Production12_12 production = new Production12_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}