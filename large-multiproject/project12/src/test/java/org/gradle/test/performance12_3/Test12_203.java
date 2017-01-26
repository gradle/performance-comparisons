package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_203 {
    private final Production12_203 production = new Production12_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}