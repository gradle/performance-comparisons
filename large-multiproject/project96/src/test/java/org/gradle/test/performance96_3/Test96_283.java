package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_283 {
    private final Production96_283 production = new Production96_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}