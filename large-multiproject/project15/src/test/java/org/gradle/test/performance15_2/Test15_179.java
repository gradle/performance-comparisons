package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_179 {
    private final Production15_179 production = new Production15_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}