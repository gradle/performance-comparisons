package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_374 {
    private final Production97_374 production = new Production97_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}