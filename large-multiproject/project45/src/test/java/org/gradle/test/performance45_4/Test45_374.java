package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_374 {
    private final Production45_374 production = new Production45_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}