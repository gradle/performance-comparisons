package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_289 {
    private final Production96_289 production = new Production96_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}