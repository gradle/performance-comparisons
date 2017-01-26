package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_374 {
    private final Production49_374 production = new Production49_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}