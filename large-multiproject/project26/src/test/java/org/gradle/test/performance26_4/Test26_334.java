package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_334 {
    private final Production26_334 production = new Production26_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}