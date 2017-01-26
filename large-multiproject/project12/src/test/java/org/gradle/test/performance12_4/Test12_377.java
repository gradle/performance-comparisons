package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_377 {
    private final Production12_377 production = new Production12_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}