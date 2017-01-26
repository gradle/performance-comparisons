package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_317 {
    private final Production12_317 production = new Production12_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}