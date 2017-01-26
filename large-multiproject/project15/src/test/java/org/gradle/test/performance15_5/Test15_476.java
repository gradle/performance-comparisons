package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_476 {
    private final Production15_476 production = new Production15_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}