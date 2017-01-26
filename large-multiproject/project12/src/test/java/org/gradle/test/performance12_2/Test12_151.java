package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_151 {
    private final Production12_151 production = new Production12_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}