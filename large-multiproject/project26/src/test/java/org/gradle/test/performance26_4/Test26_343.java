package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_343 {
    private final Production26_343 production = new Production26_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}