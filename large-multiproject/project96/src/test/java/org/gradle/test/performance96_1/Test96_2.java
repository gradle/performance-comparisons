package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_2 {
    private final Production96_2 production = new Production96_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}