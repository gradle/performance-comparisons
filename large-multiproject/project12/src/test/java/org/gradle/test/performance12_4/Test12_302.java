package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_302 {
    private final Production12_302 production = new Production12_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}