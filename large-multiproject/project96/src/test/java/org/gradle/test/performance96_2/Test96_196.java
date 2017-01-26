package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_196 {
    private final Production96_196 production = new Production96_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}