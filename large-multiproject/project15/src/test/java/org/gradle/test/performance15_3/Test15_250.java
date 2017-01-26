package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_250 {
    private final Production15_250 production = new Production15_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}