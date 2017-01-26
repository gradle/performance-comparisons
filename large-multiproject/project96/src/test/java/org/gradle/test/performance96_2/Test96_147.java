package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_147 {
    private final Production96_147 production = new Production96_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}