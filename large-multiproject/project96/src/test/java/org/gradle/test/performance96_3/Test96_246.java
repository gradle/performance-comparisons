package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_246 {
    private final Production96_246 production = new Production96_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}