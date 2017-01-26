package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_18 {
    private final Production96_18 production = new Production96_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}