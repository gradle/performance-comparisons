package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_228 {
    private final Production96_228 production = new Production96_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}