package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_113 {
    private final Production15_113 production = new Production15_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}