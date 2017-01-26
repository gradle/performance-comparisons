package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_30 {
    private final Production96_30 production = new Production96_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}