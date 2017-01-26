package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_434 {
    private final Production96_434 production = new Production96_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}