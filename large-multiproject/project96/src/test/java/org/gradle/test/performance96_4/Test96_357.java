package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_357 {
    private final Production96_357 production = new Production96_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}