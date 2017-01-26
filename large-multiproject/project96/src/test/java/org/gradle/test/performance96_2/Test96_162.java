package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_162 {
    private final Production96_162 production = new Production96_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}