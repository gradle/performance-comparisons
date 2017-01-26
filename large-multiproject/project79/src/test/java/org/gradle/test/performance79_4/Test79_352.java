package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_352 {
    private final Production79_352 production = new Production79_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}