package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_260 {
    private final Production96_260 production = new Production96_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}