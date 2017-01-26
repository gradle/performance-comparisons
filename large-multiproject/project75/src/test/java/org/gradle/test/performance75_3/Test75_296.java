package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_296 {
    private final Production75_296 production = new Production75_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}