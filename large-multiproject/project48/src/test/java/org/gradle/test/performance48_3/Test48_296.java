package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_296 {
    private final Production48_296 production = new Production48_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}