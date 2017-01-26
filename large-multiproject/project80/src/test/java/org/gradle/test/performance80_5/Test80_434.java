package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_434 {
    private final Production80_434 production = new Production80_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}