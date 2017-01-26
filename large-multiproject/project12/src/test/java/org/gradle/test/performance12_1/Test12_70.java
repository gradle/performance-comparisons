package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_70 {
    private final Production12_70 production = new Production12_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}