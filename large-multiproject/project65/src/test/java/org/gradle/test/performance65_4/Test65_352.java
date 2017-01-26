package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_352 {
    private final Production65_352 production = new Production65_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}