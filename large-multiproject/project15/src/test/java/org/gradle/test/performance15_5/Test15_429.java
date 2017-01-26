package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_429 {
    private final Production15_429 production = new Production15_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}