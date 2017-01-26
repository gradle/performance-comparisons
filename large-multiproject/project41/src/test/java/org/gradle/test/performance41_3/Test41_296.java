package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_296 {
    private final Production41_296 production = new Production41_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}