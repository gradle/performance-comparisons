package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_183 {
    private final Production96_183 production = new Production96_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}