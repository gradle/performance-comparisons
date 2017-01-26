package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_213 {
    private final Production96_213 production = new Production96_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}