package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_374 {
    private final Production73_374 production = new Production73_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}