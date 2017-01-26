package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_486 {
    private final Production96_486 production = new Production96_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}