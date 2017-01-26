package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_318 {
    private final Production15_318 production = new Production15_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}