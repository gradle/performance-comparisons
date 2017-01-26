package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_387 {
    private final Production15_387 production = new Production15_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}