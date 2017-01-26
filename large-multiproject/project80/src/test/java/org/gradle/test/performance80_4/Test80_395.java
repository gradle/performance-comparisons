package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_395 {
    private final Production80_395 production = new Production80_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}