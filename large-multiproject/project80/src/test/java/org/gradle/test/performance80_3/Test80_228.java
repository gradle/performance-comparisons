package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_228 {
    private final Production80_228 production = new Production80_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}