package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_464 {
    private final Production15_464 production = new Production15_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}