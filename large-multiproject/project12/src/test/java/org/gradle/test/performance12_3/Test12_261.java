package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_261 {
    private final Production12_261 production = new Production12_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}