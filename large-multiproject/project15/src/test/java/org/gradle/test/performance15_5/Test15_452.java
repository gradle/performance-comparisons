package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_452 {
    private final Production15_452 production = new Production15_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}