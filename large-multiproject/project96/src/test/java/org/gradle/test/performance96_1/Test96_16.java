package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_16 {
    private final Production96_16 production = new Production96_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}