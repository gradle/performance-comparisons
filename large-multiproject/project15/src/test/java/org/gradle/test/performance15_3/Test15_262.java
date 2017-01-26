package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_262 {
    private final Production15_262 production = new Production15_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}