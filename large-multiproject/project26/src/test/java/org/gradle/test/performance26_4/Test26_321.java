package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_321 {
    private final Production26_321 production = new Production26_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}