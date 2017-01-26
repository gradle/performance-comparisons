package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_293 {
    private final Production96_293 production = new Production96_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}