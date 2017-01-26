package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_227 {
    private final Production96_227 production = new Production96_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}