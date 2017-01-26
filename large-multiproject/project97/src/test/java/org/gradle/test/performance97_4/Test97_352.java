package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_352 {
    private final Production97_352 production = new Production97_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}