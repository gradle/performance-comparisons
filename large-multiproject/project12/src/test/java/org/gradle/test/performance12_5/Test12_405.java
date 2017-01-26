package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_405 {
    private final Production12_405 production = new Production12_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}