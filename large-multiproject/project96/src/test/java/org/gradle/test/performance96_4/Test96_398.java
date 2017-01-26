package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_398 {
    private final Production96_398 production = new Production96_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}