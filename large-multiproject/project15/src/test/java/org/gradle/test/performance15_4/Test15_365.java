package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_365 {
    private final Production15_365 production = new Production15_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}