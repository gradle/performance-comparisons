package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_199 {
    private final Production96_199 production = new Production96_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}