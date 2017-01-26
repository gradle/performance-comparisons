package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_208 {
    private final Production26_208 production = new Production26_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}