package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_469 {
    private final Production15_469 production = new Production15_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}