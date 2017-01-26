package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_310 {
    private final Production96_310 production = new Production96_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}