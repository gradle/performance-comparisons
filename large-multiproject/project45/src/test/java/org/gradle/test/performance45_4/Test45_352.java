package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_352 {
    private final Production45_352 production = new Production45_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}