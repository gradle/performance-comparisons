package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_249 {
    private final Production96_249 production = new Production96_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}