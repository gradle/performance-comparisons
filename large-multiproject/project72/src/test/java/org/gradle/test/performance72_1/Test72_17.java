package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_17 {
    private final Production72_17 production = new Production72_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}