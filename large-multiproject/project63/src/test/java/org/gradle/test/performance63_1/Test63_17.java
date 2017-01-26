package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_17 {
    private final Production63_17 production = new Production63_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}