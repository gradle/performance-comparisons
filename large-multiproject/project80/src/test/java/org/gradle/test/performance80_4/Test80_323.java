package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_323 {
    private final Production80_323 production = new Production80_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}