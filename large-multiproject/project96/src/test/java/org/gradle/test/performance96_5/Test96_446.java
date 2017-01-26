package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_446 {
    private final Production96_446 production = new Production96_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}