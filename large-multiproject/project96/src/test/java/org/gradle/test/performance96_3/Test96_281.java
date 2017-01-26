package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_281 {
    private final Production96_281 production = new Production96_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}