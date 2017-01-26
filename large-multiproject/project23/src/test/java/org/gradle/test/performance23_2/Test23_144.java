package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_144 {
    private final Production23_144 production = new Production23_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}