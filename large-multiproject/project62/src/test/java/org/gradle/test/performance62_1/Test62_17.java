package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_17 {
    private final Production62_17 production = new Production62_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}