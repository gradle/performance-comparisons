package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_374 {
    private final Production3_374 production = new Production3_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}