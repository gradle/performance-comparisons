package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_423 {
    private final Production12_423 production = new Production12_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}