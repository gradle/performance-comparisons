package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_83 {
    private final Production96_83 production = new Production96_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}