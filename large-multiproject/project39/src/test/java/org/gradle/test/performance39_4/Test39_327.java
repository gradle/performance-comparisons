package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_327 {
    private final Production39_327 production = new Production39_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}