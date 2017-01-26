package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_127 {
    private final Production96_127 production = new Production96_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}