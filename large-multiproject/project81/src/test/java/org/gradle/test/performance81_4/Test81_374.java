package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_374 {
    private final Production81_374 production = new Production81_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}