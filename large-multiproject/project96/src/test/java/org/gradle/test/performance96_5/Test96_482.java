package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_482 {
    private final Production96_482 production = new Production96_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}