package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_426 {
    private final Production96_426 production = new Production96_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}