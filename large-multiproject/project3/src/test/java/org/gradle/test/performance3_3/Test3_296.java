package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_296 {
    private final Production3_296 production = new Production3_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}