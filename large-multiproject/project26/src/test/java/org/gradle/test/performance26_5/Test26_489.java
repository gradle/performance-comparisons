package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_489 {
    private final Production26_489 production = new Production26_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}