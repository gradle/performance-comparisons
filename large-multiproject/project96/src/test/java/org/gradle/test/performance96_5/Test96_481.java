package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_481 {
    private final Production96_481 production = new Production96_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}