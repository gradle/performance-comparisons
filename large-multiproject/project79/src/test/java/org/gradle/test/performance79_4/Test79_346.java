package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_346 {
    private final Production79_346 production = new Production79_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}