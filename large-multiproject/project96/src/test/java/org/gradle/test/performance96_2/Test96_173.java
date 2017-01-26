package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_173 {
    private final Production96_173 production = new Production96_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}