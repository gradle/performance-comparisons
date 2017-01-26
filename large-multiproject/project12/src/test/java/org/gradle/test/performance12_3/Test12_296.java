package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_296 {
    private final Production12_296 production = new Production12_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}