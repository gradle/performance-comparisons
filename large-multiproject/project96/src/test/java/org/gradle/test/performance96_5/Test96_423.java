package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_423 {
    private final Production96_423 production = new Production96_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}