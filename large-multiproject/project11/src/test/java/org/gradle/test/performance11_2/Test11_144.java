package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_144 {
    private final Production11_144 production = new Production11_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}