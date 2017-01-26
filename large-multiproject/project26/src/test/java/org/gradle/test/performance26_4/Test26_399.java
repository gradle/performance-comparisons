package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_399 {
    private final Production26_399 production = new Production26_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}