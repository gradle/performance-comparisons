package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_348 {
    private final Production15_348 production = new Production15_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}