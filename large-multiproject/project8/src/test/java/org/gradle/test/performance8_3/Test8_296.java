package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_296 {
    private final Production8_296 production = new Production8_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}