package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_352 {
    private final Production99_352 production = new Production99_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}