package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_489 {
    private final Production15_489 production = new Production15_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}