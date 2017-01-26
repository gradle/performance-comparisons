package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_470 {
    private final Production15_470 production = new Production15_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}