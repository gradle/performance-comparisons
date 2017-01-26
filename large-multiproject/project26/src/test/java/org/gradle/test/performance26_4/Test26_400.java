package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_400 {
    private final Production26_400 production = new Production26_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}