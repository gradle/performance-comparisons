package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_113 {
    private final Production96_113 production = new Production96_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}