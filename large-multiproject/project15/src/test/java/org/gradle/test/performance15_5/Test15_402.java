package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_402 {
    private final Production15_402 production = new Production15_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}