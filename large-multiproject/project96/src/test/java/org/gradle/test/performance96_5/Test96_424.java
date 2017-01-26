package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_424 {
    private final Production96_424 production = new Production96_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}