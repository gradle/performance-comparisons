package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_374 {
    private final Production89_374 production = new Production89_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}