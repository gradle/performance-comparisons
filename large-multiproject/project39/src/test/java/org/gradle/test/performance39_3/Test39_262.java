package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_262 {
    private final Production39_262 production = new Production39_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}