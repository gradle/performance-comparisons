package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_23 {
    private final Production15_23 production = new Production15_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}