package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_161 {
    private final Production96_161 production = new Production96_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}