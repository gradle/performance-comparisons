package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_341 {
    private final Production26_341 production = new Production26_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}