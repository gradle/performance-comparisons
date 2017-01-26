package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_468 {
    private final Production12_468 production = new Production12_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}