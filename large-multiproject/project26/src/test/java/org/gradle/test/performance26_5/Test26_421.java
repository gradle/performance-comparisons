package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_421 {
    private final Production26_421 production = new Production26_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}