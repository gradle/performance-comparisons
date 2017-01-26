package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_74 {
    private final Production96_74 production = new Production96_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}