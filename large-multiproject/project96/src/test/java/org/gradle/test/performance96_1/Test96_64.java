package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_64 {
    private final Production96_64 production = new Production96_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}