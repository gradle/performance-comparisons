package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_17 {
    private final Production15_17 production = new Production15_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}