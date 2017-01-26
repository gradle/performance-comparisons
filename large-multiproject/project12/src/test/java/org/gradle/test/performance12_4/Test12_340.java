package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_340 {
    private final Production12_340 production = new Production12_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}