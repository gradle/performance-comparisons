package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_371 {
    private final Production26_371 production = new Production26_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}