package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_395 {
    private final Production96_395 production = new Production96_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}