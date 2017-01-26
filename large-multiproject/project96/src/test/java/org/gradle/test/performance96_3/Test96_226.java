package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_226 {
    private final Production96_226 production = new Production96_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}