package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_370 {
    private final Production12_370 production = new Production12_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}