package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_125 {
    private final Production15_125 production = new Production15_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}