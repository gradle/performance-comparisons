package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_244 {
    private final Production12_244 production = new Production12_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}