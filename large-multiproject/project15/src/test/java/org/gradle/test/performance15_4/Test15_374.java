package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_374 {
    private final Production15_374 production = new Production15_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}