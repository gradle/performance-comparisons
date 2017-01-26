package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_451 {
    private final Production39_451 production = new Production39_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}