package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_287 {
    private final Production96_287 production = new Production96_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}