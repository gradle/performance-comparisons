package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_384 {
    private final Production15_384 production = new Production15_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}