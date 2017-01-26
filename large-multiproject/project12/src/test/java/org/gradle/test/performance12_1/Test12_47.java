package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_47 {
    private final Production12_47 production = new Production12_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}