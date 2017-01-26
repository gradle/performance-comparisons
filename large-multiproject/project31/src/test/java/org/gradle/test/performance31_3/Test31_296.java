package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_296 {
    private final Production31_296 production = new Production31_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}