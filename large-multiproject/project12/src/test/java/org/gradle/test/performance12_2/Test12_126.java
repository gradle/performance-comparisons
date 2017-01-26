package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_126 {
    private final Production12_126 production = new Production12_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}