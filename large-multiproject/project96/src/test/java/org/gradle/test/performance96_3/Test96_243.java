package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_243 {
    private final Production96_243 production = new Production96_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}