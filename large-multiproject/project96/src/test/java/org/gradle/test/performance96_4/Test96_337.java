package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_337 {
    private final Production96_337 production = new Production96_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}