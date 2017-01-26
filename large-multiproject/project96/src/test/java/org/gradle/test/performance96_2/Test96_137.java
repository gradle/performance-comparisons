package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_137 {
    private final Production96_137 production = new Production96_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}