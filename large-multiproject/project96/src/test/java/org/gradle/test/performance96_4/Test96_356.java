package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_356 {
    private final Production96_356 production = new Production96_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}