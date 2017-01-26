package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_333 {
    private final Production96_333 production = new Production96_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}