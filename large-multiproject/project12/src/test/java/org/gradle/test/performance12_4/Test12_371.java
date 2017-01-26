package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_371 {
    private final Production12_371 production = new Production12_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}