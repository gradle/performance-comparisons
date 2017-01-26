package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_296 {
    private final Production80_296 production = new Production80_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}