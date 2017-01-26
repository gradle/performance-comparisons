package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_374 {
    private final Production65_374 production = new Production65_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}