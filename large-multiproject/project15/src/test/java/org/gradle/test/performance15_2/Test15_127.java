package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_127 {
    private final Production15_127 production = new Production15_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}