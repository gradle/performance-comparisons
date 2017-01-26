package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_346 {
    private final Production49_346 production = new Production49_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}