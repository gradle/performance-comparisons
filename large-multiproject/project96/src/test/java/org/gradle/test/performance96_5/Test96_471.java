package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_471 {
    private final Production96_471 production = new Production96_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}