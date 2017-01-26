package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_156 {
    private final Production96_156 production = new Production96_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}