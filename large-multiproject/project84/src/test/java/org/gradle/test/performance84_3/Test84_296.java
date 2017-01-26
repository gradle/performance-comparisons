package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_296 {
    private final Production84_296 production = new Production84_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}