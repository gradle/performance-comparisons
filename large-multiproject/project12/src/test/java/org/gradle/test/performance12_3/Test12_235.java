package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_235 {
    private final Production12_235 production = new Production12_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}