package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_434 {
    private final Production26_434 production = new Production26_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}