package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_17 {
    private final Production27_17 production = new Production27_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}