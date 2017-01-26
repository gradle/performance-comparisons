package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_302 {
    private final Production96_302 production = new Production96_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}