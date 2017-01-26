package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_374 {
    private final Production61_374 production = new Production61_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}