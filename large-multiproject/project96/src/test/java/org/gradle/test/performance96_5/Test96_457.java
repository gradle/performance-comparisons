package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_457 {
    private final Production96_457 production = new Production96_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}