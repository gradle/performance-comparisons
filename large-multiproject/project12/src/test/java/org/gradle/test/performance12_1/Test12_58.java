package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_58 {
    private final Production12_58 production = new Production12_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}