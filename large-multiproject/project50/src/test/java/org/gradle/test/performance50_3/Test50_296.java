package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_296 {
    private final Production50_296 production = new Production50_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}