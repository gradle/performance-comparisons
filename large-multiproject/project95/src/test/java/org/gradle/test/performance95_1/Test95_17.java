package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_17 {
    private final Production95_17 production = new Production95_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}