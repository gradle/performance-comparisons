package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_374 {
    private final Production60_374 production = new Production60_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}