package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_131 {
    private final Production96_131 production = new Production96_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}