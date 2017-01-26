package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_17 {
    private final Production60_17 production = new Production60_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}