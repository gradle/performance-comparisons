package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_144 {
    private final Production51_144 production = new Production51_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}