package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_17 {
    private final Production61_17 production = new Production61_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}