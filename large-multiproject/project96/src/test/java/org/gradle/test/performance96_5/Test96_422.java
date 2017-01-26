package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_422 {
    private final Production96_422 production = new Production96_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}