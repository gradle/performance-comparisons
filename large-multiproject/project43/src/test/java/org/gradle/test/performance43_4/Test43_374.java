package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_374 {
    private final Production43_374 production = new Production43_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}