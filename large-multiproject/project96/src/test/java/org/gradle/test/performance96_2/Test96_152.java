package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_152 {
    private final Production96_152 production = new Production96_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}