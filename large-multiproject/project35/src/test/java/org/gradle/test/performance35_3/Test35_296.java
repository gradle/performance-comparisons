package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_296 {
    private final Production35_296 production = new Production35_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}