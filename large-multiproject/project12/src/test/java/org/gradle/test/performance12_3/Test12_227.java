package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_227 {
    private final Production12_227 production = new Production12_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}