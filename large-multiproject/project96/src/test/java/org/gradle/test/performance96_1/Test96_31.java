package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_31 {
    private final Production96_31 production = new Production96_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}