package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_17 {
    private final Production89_17 production = new Production89_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}