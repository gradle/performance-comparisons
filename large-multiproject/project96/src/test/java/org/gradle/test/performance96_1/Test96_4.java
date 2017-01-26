package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_4 {
    private final Production96_4 production = new Production96_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}