package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_352 {
    private final Production60_352 production = new Production60_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}