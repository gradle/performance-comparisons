package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_109 {
    private final Production96_109 production = new Production96_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}