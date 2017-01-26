package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_151 {
    private final Production96_151 production = new Production96_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}