package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_464 {
    private final Production26_464 production = new Production26_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}