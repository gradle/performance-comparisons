package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_1 {
    private final Production96_1 production = new Production96_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}