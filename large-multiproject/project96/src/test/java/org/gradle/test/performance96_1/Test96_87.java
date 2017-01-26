package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_87 {
    private final Production96_87 production = new Production96_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}