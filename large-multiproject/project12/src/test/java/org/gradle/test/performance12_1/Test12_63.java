package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_63 {
    private final Production12_63 production = new Production12_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}