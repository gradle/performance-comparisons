package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_241 {
    private final Production96_241 production = new Production96_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}