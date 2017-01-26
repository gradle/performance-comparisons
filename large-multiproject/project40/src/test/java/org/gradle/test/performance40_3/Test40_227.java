package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_227 {
    private final Production40_227 production = new Production40_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}