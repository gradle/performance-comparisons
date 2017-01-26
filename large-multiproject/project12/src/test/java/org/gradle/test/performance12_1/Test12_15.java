package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_15 {
    private final Production12_15 production = new Production12_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}