package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_210 {
    private final Production96_210 production = new Production96_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}