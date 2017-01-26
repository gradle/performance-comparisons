package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_57 {
    private final Production12_57 production = new Production12_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}