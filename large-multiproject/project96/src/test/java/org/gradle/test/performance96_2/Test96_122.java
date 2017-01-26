package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_122 {
    private final Production96_122 production = new Production96_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}