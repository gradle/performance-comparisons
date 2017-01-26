package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_360 {
    private final Production96_360 production = new Production96_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}