package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_232 {
    private final Production26_232 production = new Production26_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}