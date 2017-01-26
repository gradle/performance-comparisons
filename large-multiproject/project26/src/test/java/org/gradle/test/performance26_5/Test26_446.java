package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_446 {
    private final Production26_446 production = new Production26_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}