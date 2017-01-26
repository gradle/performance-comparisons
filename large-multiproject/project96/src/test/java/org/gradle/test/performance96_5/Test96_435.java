package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_435 {
    private final Production96_435 production = new Production96_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}