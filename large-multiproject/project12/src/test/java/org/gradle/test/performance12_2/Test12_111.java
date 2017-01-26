package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_111 {
    private final Production12_111 production = new Production12_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}