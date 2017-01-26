package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_352 {
    private final Production73_352 production = new Production73_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}