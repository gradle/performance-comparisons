package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_173 {
    private final Production12_173 production = new Production12_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}