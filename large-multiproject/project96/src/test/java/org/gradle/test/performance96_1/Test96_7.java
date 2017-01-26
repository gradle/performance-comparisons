package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_7 {
    private final Production96_7 production = new Production96_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}