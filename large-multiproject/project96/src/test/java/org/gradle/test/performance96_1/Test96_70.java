package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_70 {
    private final Production96_70 production = new Production96_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}