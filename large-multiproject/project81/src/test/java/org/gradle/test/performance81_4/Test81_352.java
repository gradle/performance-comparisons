package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_352 {
    private final Production81_352 production = new Production81_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}