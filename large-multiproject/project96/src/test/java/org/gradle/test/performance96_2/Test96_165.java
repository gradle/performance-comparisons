package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_165 {
    private final Production96_165 production = new Production96_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}