package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_94 {
    private final Production15_94 production = new Production15_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}