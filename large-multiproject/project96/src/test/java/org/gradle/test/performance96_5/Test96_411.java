package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_411 {
    private final Production96_411 production = new Production96_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}