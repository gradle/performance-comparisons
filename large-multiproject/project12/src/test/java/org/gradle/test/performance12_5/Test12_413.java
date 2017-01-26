package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_413 {
    private final Production12_413 production = new Production12_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}