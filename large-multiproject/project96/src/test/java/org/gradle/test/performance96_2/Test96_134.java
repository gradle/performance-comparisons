package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_134 {
    private final Production96_134 production = new Production96_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}