package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_296 {
    private final Production28_296 production = new Production28_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}