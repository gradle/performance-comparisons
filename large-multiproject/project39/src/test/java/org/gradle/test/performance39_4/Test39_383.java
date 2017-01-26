package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_383 {
    private final Production39_383 production = new Production39_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}