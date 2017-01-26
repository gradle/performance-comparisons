package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_374 {
    private final Production90_374 production = new Production90_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}