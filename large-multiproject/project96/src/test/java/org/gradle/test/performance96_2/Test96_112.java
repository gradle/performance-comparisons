package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_112 {
    private final Production96_112 production = new Production96_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}