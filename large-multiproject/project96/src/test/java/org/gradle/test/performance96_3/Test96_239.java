package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_239 {
    private final Production96_239 production = new Production96_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}