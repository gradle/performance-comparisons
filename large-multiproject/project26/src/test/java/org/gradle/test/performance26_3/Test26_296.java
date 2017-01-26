package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_296 {
    private final Production26_296 production = new Production26_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}