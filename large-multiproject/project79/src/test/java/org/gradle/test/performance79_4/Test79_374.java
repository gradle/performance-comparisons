package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_374 {
    private final Production79_374 production = new Production79_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}