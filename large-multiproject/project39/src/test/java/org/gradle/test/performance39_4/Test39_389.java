package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_389 {
    private final Production39_389 production = new Production39_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}