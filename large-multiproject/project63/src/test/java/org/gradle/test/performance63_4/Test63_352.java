package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_352 {
    private final Production63_352 production = new Production63_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}