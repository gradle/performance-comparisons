package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_237 {
    private final Production26_237 production = new Production26_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}