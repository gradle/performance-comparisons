package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_55 {
    private final Production15_55 production = new Production15_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}