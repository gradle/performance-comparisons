package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_273 {
    private final Production15_273 production = new Production15_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}