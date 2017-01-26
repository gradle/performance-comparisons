package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_374 {
    private final Production74_374 production = new Production74_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}