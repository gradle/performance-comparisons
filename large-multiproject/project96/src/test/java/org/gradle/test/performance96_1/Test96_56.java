package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_56 {
    private final Production96_56 production = new Production96_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}