package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_116 {
    private final Production26_116 production = new Production26_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}