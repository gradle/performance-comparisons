package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_144 {
    private final Production87_144 production = new Production87_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}