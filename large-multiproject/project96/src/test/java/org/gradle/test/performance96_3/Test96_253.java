package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_253 {
    private final Production96_253 production = new Production96_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}