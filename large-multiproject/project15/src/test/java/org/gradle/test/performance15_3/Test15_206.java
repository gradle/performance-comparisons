package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_206 {
    private final Production15_206 production = new Production15_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}