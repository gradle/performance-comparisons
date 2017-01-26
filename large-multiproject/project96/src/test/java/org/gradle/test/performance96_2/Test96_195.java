package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_195 {
    private final Production96_195 production = new Production96_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}