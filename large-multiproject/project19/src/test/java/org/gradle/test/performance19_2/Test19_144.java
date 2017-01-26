package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_144 {
    private final Production19_144 production = new Production19_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}