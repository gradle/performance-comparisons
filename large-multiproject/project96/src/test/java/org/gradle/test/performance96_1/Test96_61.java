package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_61 {
    private final Production96_61 production = new Production96_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}