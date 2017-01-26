package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_396 {
    private final Production12_396 production = new Production12_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}