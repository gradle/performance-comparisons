package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_284 {
    private final Production26_284 production = new Production26_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}