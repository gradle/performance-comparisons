package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_450 {
    private final Production96_450 production = new Production96_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}