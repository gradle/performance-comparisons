package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_374 {
    private final Production95_374 production = new Production95_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}