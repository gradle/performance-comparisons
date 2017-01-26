package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_352 {
    private final Production12_352 production = new Production12_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}