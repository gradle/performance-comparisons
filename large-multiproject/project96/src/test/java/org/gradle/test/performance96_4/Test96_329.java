package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_329 {
    private final Production96_329 production = new Production96_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}