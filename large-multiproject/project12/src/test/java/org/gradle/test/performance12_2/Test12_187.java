package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_187 {
    private final Production12_187 production = new Production12_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}