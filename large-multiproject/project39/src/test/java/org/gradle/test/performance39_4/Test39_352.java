package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_352 {
    private final Production39_352 production = new Production39_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}