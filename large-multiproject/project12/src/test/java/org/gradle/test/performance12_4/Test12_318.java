package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_318 {
    private final Production12_318 production = new Production12_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}