package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_114 {
    private final Production96_114 production = new Production96_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}