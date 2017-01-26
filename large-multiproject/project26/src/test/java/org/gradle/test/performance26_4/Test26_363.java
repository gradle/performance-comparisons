package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_363 {
    private final Production26_363 production = new Production26_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}