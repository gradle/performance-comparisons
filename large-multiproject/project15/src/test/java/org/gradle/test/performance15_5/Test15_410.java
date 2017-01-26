package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_410 {
    private final Production15_410 production = new Production15_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}