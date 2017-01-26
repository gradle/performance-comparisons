package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_155 {
    private final Production12_155 production = new Production12_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}