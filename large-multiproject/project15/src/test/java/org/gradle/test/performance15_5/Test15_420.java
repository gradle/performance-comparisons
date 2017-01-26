package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_420 {
    private final Production15_420 production = new Production15_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}