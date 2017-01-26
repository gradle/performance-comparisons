package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_313 {
    private final Production96_313 production = new Production96_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}