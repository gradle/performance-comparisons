package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_145 {
    private final Production96_145 production = new Production96_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}