package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_187 {
    private final Production96_187 production = new Production96_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}