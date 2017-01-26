package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_296 {
    private final Production16_296 production = new Production16_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}