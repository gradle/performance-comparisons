package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_278 {
    private final Production39_278 production = new Production39_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}