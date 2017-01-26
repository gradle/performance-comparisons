package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_48 {
    private final Production96_48 production = new Production96_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}