package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_294 {
    private final Production96_294 production = new Production96_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}