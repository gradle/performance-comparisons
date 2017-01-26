package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_374 {
    private final Production66_374 production = new Production66_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}