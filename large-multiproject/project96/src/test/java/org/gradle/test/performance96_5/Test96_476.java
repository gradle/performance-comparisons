package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_476 {
    private final Production96_476 production = new Production96_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}