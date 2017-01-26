package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_307 {
    private final Production12_307 production = new Production12_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}