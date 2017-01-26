package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_235 {
    private final Production96_235 production = new Production96_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}