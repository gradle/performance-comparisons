package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_297 {
    private final Production96_297 production = new Production96_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}