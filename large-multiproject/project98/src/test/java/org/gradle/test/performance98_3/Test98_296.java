package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_296 {
    private final Production98_296 production = new Production98_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}