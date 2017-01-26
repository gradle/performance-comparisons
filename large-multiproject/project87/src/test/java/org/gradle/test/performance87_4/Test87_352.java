package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_352 {
    private final Production87_352 production = new Production87_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}