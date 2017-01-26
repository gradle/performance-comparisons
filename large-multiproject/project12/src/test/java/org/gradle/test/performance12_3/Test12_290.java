package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_290 {
    private final Production12_290 production = new Production12_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}