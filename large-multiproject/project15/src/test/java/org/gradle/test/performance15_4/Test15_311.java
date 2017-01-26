package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_311 {
    private final Production15_311 production = new Production15_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}