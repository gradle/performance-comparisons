package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_296 {
    private final Production15_296 production = new Production15_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}