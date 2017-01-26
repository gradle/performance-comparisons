package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_17 {
    private final Production18_17 production = new Production18_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}