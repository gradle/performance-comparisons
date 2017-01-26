package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_381 {
    private final Production96_381 production = new Production96_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}