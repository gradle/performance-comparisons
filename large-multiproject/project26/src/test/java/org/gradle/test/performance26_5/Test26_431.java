package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_431 {
    private final Production26_431 production = new Production26_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}