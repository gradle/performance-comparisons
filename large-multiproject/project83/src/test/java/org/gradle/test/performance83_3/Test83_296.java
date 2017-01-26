package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_296 {
    private final Production83_296 production = new Production83_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}