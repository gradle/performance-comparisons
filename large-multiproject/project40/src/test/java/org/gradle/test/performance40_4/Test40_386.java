package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_386 {
    private final Production40_386 production = new Production40_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}