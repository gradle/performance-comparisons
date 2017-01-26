package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_34 {
    private final Production12_34 production = new Production12_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}