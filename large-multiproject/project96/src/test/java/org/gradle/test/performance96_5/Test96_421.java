package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_421 {
    private final Production96_421 production = new Production96_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}