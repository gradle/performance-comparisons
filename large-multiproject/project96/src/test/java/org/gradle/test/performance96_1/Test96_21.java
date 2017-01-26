package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_21 {
    private final Production96_21 production = new Production96_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}