package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_296 {
    private final Production13_296 production = new Production13_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}