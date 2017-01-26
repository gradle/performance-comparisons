package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_350 {
    private final Production96_350 production = new Production96_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}