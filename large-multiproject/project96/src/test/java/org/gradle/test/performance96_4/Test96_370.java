package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_370 {
    private final Production96_370 production = new Production96_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}