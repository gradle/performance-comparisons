package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_17 {
    private final Production14_17 production = new Production14_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}