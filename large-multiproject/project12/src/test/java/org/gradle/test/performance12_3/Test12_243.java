package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_243 {
    private final Production12_243 production = new Production12_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}