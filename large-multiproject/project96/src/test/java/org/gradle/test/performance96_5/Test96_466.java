package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_466 {
    private final Production96_466 production = new Production96_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}