package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_140 {
    private final Production96_140 production = new Production96_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}