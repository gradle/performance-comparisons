package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_175 {
    private final Production96_175 production = new Production96_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}