package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_63 {
    private final Production96_63 production = new Production96_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}