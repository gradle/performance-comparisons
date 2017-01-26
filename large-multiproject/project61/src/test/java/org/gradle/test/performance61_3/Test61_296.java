package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_296 {
    private final Production61_296 production = new Production61_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}