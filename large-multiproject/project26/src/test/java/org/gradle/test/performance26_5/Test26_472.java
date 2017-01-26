package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_472 {
    private final Production26_472 production = new Production26_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}