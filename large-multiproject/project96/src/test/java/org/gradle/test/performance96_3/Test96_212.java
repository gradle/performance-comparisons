package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_212 {
    private final Production96_212 production = new Production96_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}