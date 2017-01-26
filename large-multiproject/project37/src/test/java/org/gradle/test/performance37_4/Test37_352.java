package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_352 {
    private final Production37_352 production = new Production37_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}