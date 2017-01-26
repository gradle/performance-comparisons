package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_144 {
    private final Production91_144 production = new Production91_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}