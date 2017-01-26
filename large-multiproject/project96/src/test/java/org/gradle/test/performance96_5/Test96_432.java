package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_432 {
    private final Production96_432 production = new Production96_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}