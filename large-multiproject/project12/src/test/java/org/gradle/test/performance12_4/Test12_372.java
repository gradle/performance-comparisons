package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_372 {
    private final Production12_372 production = new Production12_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}