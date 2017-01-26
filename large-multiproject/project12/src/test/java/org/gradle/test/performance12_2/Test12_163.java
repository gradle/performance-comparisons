package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_163 {
    private final Production12_163 production = new Production12_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}