package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_488 {
    private final Production12_488 production = new Production12_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}