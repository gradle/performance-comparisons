package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_144 {
    private final Production33_144 production = new Production33_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}