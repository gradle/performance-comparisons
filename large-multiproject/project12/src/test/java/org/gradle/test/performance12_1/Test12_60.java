package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_60 {
    private final Production12_60 production = new Production12_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}