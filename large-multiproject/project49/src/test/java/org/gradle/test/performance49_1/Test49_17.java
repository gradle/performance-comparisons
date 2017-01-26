package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_17 {
    private final Production49_17 production = new Production49_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}