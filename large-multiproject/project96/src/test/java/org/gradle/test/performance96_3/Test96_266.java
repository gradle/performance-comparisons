package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_266 {
    private final Production96_266 production = new Production96_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}