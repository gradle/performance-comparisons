package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_222 {
    private final Production96_222 production = new Production96_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}