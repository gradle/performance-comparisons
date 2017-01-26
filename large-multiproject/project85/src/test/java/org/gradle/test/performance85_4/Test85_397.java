package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_397 {
    private final Production85_397 production = new Production85_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}