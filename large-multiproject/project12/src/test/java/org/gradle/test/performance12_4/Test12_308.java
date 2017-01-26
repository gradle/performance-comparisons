package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_308 {
    private final Production12_308 production = new Production12_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}