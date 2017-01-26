package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_84 {
    private final Production12_84 production = new Production12_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}