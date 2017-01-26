package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_54 {
    private final Production12_54 production = new Production12_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}