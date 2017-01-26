package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_115 {
    private final Production96_115 production = new Production96_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}