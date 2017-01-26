package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_296 {
    private final Production5_296 production = new Production5_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}