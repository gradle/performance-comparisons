package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_387 {
    private final Production26_387 production = new Production26_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}