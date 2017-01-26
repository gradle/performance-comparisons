package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_477 {
    private final Production26_477 production = new Production26_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}