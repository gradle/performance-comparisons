package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_70 {
    private final Production15_70 production = new Production15_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}