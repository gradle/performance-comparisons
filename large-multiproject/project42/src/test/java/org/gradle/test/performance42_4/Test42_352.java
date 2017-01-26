package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_352 {
    private final Production42_352 production = new Production42_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}