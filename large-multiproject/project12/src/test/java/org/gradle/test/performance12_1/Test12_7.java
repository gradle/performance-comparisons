package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_7 {
    private final Production12_7 production = new Production12_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}