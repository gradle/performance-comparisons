package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_285 {
    private final Production96_285 production = new Production96_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}