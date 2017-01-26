package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_263 {
    private final Production96_263 production = new Production96_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}