package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_17 {
    private final Production1_17 production = new Production1_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}