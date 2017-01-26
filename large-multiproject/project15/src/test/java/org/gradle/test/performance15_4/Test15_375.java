package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_375 {
    private final Production15_375 production = new Production15_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}