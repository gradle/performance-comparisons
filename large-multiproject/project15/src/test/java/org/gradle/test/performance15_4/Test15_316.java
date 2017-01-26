package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_316 {
    private final Production15_316 production = new Production15_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}