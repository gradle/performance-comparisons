package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_144 {
    private final Production52_144 production = new Production52_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}