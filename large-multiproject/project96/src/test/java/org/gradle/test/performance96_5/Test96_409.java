package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_409 {
    private final Production96_409 production = new Production96_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}