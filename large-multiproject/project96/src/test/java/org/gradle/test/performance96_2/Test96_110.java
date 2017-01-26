package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_110 {
    private final Production96_110 production = new Production96_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}