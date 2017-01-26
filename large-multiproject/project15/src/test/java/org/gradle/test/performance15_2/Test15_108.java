package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_108 {
    private final Production15_108 production = new Production15_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}