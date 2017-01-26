package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_487 {
    private final Production39_487 production = new Production39_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}