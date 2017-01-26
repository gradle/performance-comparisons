package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_92 {
    private final Production96_92 production = new Production96_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}