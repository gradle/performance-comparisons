package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_189 {
    private final Production12_189 production = new Production12_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}