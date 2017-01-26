package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_165 {
    private final Production12_165 production = new Production12_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}