package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_154 {
    private final Production96_154 production = new Production96_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}