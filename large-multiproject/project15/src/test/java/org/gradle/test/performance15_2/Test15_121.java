package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_121 {
    private final Production15_121 production = new Production15_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}