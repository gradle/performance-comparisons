package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_189 {
    private final Production96_189 production = new Production96_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}