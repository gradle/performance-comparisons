package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_44 {
    private final Production96_44 production = new Production96_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}