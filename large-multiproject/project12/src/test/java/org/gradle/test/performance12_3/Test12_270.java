package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_270 {
    private final Production12_270 production = new Production12_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}