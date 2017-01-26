package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_372 {
    private final Production26_372 production = new Production26_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}