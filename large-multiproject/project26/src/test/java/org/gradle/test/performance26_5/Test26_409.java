package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_409 {
    private final Production26_409 production = new Production26_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}