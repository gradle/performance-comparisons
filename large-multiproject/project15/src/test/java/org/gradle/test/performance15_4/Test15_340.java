package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_340 {
    private final Production15_340 production = new Production15_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}