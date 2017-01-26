package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_374 {
    private final Production44_374 production = new Production44_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}