package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_237 {
    private final Production12_237 production = new Production12_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}