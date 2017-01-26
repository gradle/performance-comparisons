package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_373 {
    private final Production96_373 production = new Production96_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}