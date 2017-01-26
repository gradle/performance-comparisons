package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_126 {
    private final Production96_126 production = new Production96_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}