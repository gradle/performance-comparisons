package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_168 {
    private final Production96_168 production = new Production96_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}