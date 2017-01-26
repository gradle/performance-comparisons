package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_340 {
    private final Production26_340 production = new Production26_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}