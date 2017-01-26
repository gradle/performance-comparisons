package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_364 {
    private final Production12_364 production = new Production12_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}