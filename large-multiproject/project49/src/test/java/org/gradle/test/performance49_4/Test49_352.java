package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_352 {
    private final Production49_352 production = new Production49_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}