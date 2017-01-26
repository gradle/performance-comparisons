package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_141 {
    private final Production39_141 production = new Production39_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}