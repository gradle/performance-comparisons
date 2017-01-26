package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_452 {
    private final Production26_452 production = new Production26_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}