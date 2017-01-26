package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_52 {
    private final Production96_52 production = new Production96_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}