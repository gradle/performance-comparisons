package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_150 {
    private final Production12_150 production = new Production12_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}