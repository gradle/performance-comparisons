package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_328 {
    private final Production96_328 production = new Production96_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}