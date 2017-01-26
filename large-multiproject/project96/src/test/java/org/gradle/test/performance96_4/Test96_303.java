package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_303 {
    private final Production96_303 production = new Production96_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}