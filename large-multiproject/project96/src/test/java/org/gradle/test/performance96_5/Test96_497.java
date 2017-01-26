package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_497 {
    private final Production96_497 production = new Production96_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}