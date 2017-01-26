package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_323 {
    private final Production96_323 production = new Production96_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}