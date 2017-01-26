package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_300 {
    private final Production80_300 production = new Production80_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}