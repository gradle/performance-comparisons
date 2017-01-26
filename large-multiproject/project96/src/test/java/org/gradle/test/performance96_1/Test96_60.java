package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_60 {
    private final Production96_60 production = new Production96_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}