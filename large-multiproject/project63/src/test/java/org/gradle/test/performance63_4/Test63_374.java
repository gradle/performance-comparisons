package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_374 {
    private final Production63_374 production = new Production63_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}