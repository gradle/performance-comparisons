package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_204 {
    private final Production96_204 production = new Production96_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}