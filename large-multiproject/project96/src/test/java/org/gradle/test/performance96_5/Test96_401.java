package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_401 {
    private final Production96_401 production = new Production96_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}