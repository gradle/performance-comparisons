package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_374 {
    private final Production27_374 production = new Production27_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}