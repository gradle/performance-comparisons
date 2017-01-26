package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_139 {
    private final Production96_139 production = new Production96_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}