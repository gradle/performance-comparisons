package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_346 {
    private final Production85_346 production = new Production85_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}