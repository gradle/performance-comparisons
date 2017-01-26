package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_107 {
    private final Production96_107 production = new Production96_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}