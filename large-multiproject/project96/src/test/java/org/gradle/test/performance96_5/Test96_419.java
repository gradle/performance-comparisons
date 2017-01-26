package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_419 {
    private final Production96_419 production = new Production96_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}