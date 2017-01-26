package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_296 {
    private final Production73_296 production = new Production73_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}