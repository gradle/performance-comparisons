package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_95 {
    private final Production96_95 production = new Production96_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}