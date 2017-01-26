package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_54 {
    private final Production96_54 production = new Production96_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}