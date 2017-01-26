package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_440 {
    private final Production12_440 production = new Production12_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}