package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_15 {
    private final Production96_15 production = new Production96_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}