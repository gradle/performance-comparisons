package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_188 {
    private final Production96_188 production = new Production96_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}