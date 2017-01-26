package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_174 {
    private final Production96_174 production = new Production96_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}