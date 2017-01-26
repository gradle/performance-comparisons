package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_431 {
    private final Production12_431 production = new Production12_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}