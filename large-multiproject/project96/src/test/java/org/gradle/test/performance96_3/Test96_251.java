package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_251 {
    private final Production96_251 production = new Production96_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}