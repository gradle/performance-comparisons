package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_218 {
    private final Production12_218 production = new Production12_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}