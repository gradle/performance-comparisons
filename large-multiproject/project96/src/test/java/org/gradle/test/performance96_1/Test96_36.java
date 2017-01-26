package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_36 {
    private final Production96_36 production = new Production96_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}