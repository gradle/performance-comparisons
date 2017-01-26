package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_186 {
    private final Production96_186 production = new Production96_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}