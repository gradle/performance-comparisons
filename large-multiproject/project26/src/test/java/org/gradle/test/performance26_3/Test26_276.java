package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_276 {
    private final Production26_276 production = new Production26_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}