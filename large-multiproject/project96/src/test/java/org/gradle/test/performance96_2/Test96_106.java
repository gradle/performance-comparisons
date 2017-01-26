package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_106 {
    private final Production96_106 production = new Production96_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}