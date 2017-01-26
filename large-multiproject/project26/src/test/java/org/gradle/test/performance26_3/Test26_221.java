package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_221 {
    private final Production26_221 production = new Production26_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}