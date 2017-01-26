package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_33 {
    private final Production96_33 production = new Production96_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}