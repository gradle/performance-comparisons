package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_259 {
    private final Production96_259 production = new Production96_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}