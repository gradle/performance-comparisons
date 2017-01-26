package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_275 {
    private final Production15_275 production = new Production15_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}