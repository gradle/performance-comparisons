package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_221 {
    private final Production15_221 production = new Production15_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}