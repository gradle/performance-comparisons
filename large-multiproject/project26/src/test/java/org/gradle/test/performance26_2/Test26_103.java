package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_103 {
    private final Production26_103 production = new Production26_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}