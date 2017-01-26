package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_145 {
    private final Production12_145 production = new Production12_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}