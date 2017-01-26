package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_431 {
    private final Production96_431 production = new Production96_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}