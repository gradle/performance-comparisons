package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_374 {
    private final Production18_374 production = new Production18_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}