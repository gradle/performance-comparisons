package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_478 {
    private final Production39_478 production = new Production39_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}