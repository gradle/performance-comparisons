package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_247 {
    private final Production96_247 production = new Production96_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}