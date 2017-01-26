package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_129 {
    private final Production26_129 production = new Production26_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}