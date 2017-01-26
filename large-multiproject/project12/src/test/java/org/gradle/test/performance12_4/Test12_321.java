package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_321 {
    private final Production12_321 production = new Production12_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}