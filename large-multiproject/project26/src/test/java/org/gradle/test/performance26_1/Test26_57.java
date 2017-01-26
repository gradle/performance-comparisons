package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_57 {
    private final Production26_57 production = new Production26_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}