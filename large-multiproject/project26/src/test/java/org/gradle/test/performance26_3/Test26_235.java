package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_235 {
    private final Production26_235 production = new Production26_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}