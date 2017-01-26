package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_365 {
    private final Production96_365 production = new Production96_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}