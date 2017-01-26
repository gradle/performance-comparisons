package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_164 {
    private final Production12_164 production = new Production12_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}