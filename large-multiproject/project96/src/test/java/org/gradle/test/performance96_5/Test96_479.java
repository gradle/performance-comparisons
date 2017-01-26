package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_479 {
    private final Production96_479 production = new Production96_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}