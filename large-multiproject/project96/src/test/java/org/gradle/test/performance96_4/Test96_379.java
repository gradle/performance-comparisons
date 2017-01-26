package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_379 {
    private final Production96_379 production = new Production96_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}