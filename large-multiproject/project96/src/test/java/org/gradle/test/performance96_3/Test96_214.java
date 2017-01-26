package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_214 {
    private final Production96_214 production = new Production96_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}