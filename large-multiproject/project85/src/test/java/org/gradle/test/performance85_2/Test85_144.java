package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_144 {
    private final Production85_144 production = new Production85_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}