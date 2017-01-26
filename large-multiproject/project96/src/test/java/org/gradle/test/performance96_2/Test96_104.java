package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_104 {
    private final Production96_104 production = new Production96_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}