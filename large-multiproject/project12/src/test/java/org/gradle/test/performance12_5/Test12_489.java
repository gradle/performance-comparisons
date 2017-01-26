package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_489 {
    private final Production12_489 production = new Production12_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}