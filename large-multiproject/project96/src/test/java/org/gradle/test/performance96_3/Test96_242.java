package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_242 {
    private final Production96_242 production = new Production96_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}