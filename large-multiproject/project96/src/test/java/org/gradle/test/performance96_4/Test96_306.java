package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_306 {
    private final Production96_306 production = new Production96_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}