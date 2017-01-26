package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_238 {
    private final Production96_238 production = new Production96_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}