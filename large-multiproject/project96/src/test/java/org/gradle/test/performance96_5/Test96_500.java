package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_500 {
    private final Production96_500 production = new Production96_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}