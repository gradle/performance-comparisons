package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_458 {
    private final Production96_458 production = new Production96_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}