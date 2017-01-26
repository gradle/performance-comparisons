package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_357 {
    private final Production26_357 production = new Production26_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}