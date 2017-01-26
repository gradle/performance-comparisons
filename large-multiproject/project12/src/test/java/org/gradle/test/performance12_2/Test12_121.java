package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_121 {
    private final Production12_121 production = new Production12_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}