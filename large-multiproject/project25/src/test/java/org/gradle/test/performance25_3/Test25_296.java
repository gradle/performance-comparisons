package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_296 {
    private final Production25_296 production = new Production25_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}