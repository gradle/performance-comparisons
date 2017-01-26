package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_486 {
    private final Production15_486 production = new Production15_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}