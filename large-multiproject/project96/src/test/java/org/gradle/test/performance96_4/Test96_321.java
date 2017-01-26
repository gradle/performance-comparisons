package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_321 {
    private final Production96_321 production = new Production96_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}