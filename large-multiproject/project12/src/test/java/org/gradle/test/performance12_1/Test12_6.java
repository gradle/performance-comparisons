package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_6 {
    private final Production12_6 production = new Production12_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}