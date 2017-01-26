package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_1 {
    private final Production12_1 production = new Production12_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}