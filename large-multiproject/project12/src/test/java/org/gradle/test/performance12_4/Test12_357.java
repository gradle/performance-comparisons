package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_357 {
    private final Production12_357 production = new Production12_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}