package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_374 {
    private final Production86_374 production = new Production86_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}