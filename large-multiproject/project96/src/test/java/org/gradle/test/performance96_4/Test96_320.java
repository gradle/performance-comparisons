package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_320 {
    private final Production96_320 production = new Production96_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}