package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_17 {
    private final Production81_17 production = new Production81_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}