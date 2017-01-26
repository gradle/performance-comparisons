package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_53 {
    private final Production12_53 production = new Production12_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}