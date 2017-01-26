package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_65 {
    private final Production96_65 production = new Production96_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}