package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_379 {
    private final Production12_379 production = new Production12_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}