package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_354 {
    private final Production96_354 production = new Production96_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}