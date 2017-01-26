package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_473 {
    private final Production26_473 production = new Production26_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}