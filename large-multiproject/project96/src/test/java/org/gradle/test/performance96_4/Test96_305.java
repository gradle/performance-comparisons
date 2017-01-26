package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_305 {
    private final Production96_305 production = new Production96_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}