package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_143 {
    private final Production96_143 production = new Production96_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}