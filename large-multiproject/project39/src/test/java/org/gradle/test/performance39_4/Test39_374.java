package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_374 {
    private final Production39_374 production = new Production39_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}