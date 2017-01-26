package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_384 {
    private final Production26_384 production = new Production26_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}