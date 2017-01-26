package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_144 {
    private final Production38_144 production = new Production38_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}