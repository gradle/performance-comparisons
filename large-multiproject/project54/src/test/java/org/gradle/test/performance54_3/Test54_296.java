package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_296 {
    private final Production54_296 production = new Production54_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}