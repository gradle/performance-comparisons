package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_336 {
    private final Production12_336 production = new Production12_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}