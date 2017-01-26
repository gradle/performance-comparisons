package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_296 {
    private final Production55_296 production = new Production55_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}