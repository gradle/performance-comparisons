package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_401 {
    private final Production26_401 production = new Production26_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}