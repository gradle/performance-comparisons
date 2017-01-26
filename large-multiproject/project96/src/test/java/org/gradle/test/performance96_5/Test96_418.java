package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_418 {
    private final Production96_418 production = new Production96_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}