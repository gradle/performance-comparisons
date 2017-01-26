package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_8 {
    private final Production12_8 production = new Production12_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}