package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_363 {
    private final Production12_363 production = new Production12_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}