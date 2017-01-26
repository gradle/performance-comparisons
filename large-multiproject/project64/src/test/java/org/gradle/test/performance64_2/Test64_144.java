package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_144 {
    private final Production64_144 production = new Production64_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}