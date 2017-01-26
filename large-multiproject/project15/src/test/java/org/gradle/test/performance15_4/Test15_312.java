package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_312 {
    private final Production15_312 production = new Production15_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}