package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_131 {
    private final Production15_131 production = new Production15_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}